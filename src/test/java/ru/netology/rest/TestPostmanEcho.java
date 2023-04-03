package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestPostmanEcho {

    @Test
    void shouldPostInquiryPut(){
        given()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "text/plain; charset=UTF-8")
                .body("петр") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(200)
                .body("data" , equalTo("Чебурашка"))
                ;
    }
}
