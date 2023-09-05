package com.graphDemo.graph.bookDetails;

import java.util.Arrays;
import java.util.List;

public class AuthorContactDetails {
    private String id;
    private String email;
    private String mobileNumber;

    public AuthorContactDetails(String id, String email, String mobileNumber){
        this.id = id;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    private  static List<AuthorContactDetails> contactDetailsList = Arrays.asList(
            new AuthorContactDetails("contact-1", "ad@gmail.com", "987868111"),
            new AuthorContactDetails("contact-2", "anil@gmail.com", "876878681"),
            new AuthorContactDetails("contact-3", "baboo@gmail.com", "141671156")

    );

    public  static AuthorContactDetails getById(String id){
        return  contactDetailsList.stream()
                .filter(AuthorContactDetails -> AuthorContactDetails.getId().equals(id)).findFirst().orElse(null);
    }
    public String getId(){
        return id;
    }
}
