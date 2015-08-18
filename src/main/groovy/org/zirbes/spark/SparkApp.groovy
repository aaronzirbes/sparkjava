package org.zirbes.spark

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j

import spark.Request
import spark.Response

import static spark.Spark.get

@CompileStatic
@Slf4j
class SparkApp {

    static void main(String... argv) {
        get('/') { req, res ->
            "Hello World"
        }
    }

}
