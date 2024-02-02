package br.com.silvamap;

import io.micronaut.http.annotation.*;

@Controller("/programa-pontos")
public class ProgramaPontosController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}