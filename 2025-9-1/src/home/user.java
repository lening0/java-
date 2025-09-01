package home;

public class user {
    private String userName;
    private String password;
    private String idCard;
    public int phoneNumber;

    public user() {
    }

    public user(String userName, String password, String idCard, int phoneNumber) {
        this.userName = userName;
        this.password = password;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return idCard
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置
     * @param phoneNumber
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "user{userName = " + userName + ", password = " + password + ", idCard = " + idCard + ", phoneNumber = " + phoneNumber + "}";
    }
}
