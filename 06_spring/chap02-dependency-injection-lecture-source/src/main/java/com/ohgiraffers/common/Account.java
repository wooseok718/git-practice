package com.ohgiraffers.common;

public interface Account {      // MemberDTO에게 의존을 받는 추상 인터페이스 Account

    /* 설명. 잔액 조회 */
    String getBalance();

    /* 설명. 입금 */
    String deposit(int money);

    /* 설명. 출금 */
    String withDraw(int money);

}
