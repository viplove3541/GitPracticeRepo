

public class NewClass{
    private String Email;
    private String Password;

   NewClass(String email, String password){
       this.Email = email;
       this.Password = password;


   }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        Password = password;
    }
    void newMethod(){
        System.out.println(" Email" + this.Email);
        System.out.println(" Password" + this.Password);

    }

}