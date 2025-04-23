package com.ohgiraffers.section01.common;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookDAOImpl implements BookDAO {

    private Map<Integer, BookDTO> bookList;     // 수정이 잦으면 map 아니면 list

    /* 설명. JDBC를 활용한 실제 DB연동 대신 dummy data로 초기화*/
    public BookDAOImpl() {
        bookList = new HashMap<>();

        bookList.put(1,
                new BookDTO(1, 123456, "자바의정석",
                        "남궁성", "도우출판", new java.util.Date()));

    }

    /* 설명. Map을 List형태로 변환 */
    @Override
    public List<BookDTO> findAllBook() {
        return new ArrayList<>(bookList.values());      // map을 도중에 list의 형태로 변환할 때
    }
    @Override
    public BookDTO findBookBySequence(int sequence) {
        return bookList.get(sequence);
    }
}
