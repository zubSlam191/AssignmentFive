package com.email.domain;

import java.util.Comparator;

/**
 * Created by student on 2016/04/04.
 */
public class DateComparator implements Comparator<MailEntry> {
    @Override
    public int compare(MailEntry t0, MailEntry t1) {
        return t0.getDate().compareTo(t1.getDate());
    }
}

