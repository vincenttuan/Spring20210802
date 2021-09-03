package com.study.spring.case06.tx.service;

import com.study.spring.case06.tx.exception.InsufficientAmount;
import com.study.spring.case06.tx.exception.InsufficientQuantity;

public interface BookService {
	void buyOne(Integer wid, Integer bid) throws InsufficientAmount, InsufficientQuantity;
	void buyMany(Integer wid, Integer... bids) throws InsufficientAmount, InsufficientQuantity;
}
