package com.email.factories;

import com.email.domain.Email;

/**
 * Created by student on 2016/04/04.
 */
public interface EmailsFactory  {
    Email createEmail(String address, String description);
}
