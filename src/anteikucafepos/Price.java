/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anteikucafepos;

/**
 *
 * @author Administrator
 */
public class Price {
    private float _ItemPriceSmall = 0f;
    private float _ItemPriceMedium = 0f;
    private float _ItemPriceLarge = 0f;
    
    Price(String ItemPriceSmall,String ItemPriceMedium,String ItemPriceLarge){
        this._ItemPriceSmall = Float.parseFloat(ItemPriceSmall);
        this._ItemPriceMedium = Float.parseFloat(ItemPriceMedium);
        this._ItemPriceLarge = Float.parseFloat(ItemPriceLarge);
    }
    
    public float getItemPriceSmall() {
        return _ItemPriceSmall;
    }
    public float getItemPriceMedium() {
        return _ItemPriceMedium;
    }
    public float getItemPriceLarge() {
        return _ItemPriceLarge;
    }
    
    public void DisplayPrices(){
    System.out.println(_ItemPriceSmall + " " + _ItemPriceMedium + " " + _ItemPriceLarge );
    }
}
