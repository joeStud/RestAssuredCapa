package Request;
//importar primero librerias

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestRequest {
    public static void main(String[] args) {

//-------body
        Response response = given().get("https://reqres.in/api/users");
        // response.prettyPrint();
        //otra forma de imprimir el body
        String respJson = response.asString();
        System.out.println(respJson);
        //para codigos de respiesta de un aoperacion
        System.out.println("Status code is: "+response.statusCode());
    }
}
