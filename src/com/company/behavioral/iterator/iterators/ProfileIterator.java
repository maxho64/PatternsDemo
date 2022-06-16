package com.company.behavioral.iterator.iterators;

import com.company.behavioral.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}