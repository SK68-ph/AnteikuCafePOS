
package anteikucafepos;

public class Products {
    private int _price;
        private String _id;
        private String _prodName;
        private String _size;
        
        
        public int getPrice() {
            return _price;
        }
        public void setPrice(int price) {
            this._price = price;
        }
        public String getSize() {
            return _size;
        }
        public void setSize(String size) {
            this._size = size;
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
