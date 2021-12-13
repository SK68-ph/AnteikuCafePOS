
package anteikucafepos;

public class Products {
        private String _id;
        private String _prodName;
        public Price _prices;
        
        public void setPrice(Price prices) {
            this._prices = prices;
        }
        
        public String getProductId() {
             return _id;
        }
        public void setProductId(String id) {
            this._id = id;
       }
        public String getProductName() {
             return _prodName;
        }
        public void setProductName(String name) {
            this._prodName = name;
       }
        
        

}
