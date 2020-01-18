
package planetfood.Pojo;

public class Order {
    private String OrdId;
    private String OrdDate;
    private Double Gst;
    private Double GstAmount;
    private Double Discount;
    private Double GrandTotal;
    private String UserId;
    private Double OrdAmount;

    public String getOrdId() {
        return OrdId;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public Double getGst() {
        return Gst;
    }

    public void setGst(Double Gst) {
        this.Gst = Gst;
    }

    public Double getGstAmount() {
        return GstAmount;
    }

    public void setGstAmount(Double GstAmount) {
        this.GstAmount = GstAmount;
    }

    public Double getDiscount() {
        return Discount;
    }

    public void setDiscount(Double Discount) {
        this.Discount = Discount;
    }

    public Double getGrandTotal() {
        return GrandTotal;
    }

    public void setGrandTotal(Double GrandTotal) {
        this.GrandTotal = GrandTotal;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public Double getOrdAmount() {
        return OrdAmount;
    }

    public void setOrdAmount(Double OrdAmount) {
        this.OrdAmount = OrdAmount;
    }
    
    
    
}
