package com.driver;

import java.util.HashMap;
import java.util.Map;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }



    public boolean checkValidCharacter(String newPassword)
    {
       boolean upperChar=false;
       boolean lowerChar=false;
       boolean digit=false;
       boolean specialChar=false;

        for(int i=0;i<newPassword.length();i++)
        {
            char ch=newPassword.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                upperChar=true;
            }

            if(ch>='a' && ch<='z')
            {
                lowerChar=true;
            }

            if(Character.isDigit(ch))
            {
                digit=true;
            }
            if(!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch))
            {
                specialChar=true;
            }

        }

      if(newPassword.length()==8 && specialChar==true && digit==true && lowerChar==true && upperChar==true)
      {
          return true;
      }
      return false;
    }

    public void changePassword(String oldPassword, String newPassword){
        if(this.password.equals(oldPassword))
        {
            if(checkValidCharacter(newPassword))
            {
                this.password=newPassword;
            }

        }
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
    }
}
