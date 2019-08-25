package com.maxanderson.unittesting

import com.maxanderson.unittesting.controllers.WebController

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class LoadContextTest extends Specification{
    @Autowired (required = false)
    private WebController webController



    def "when context is loaded then all expected beans are created"() {
        expect: "the WebController is created"
        webController
    }

    def "one plus one should equal two"(){
        expect:
        1 + 1 == 2
    }

    def "this should fail" () {
        expect:
        1 + 1 == 3
    }


}
