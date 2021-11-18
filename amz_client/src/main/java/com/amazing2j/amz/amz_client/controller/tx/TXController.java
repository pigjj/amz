package com.amazing2j.amz.amz_client.controller.welcome.tx;

import com.amazing2j.amz.amz_server.utils.JsonResponse;
import com.amazing2j.amz.amz_server.utils.JsonResult;
import com.amazing2j.amz.amz_server.utils.TXIdGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "TX")
public class TXController {

    final TXIdGenerator generator;

    public TXController(TXIdGenerator generator) {
        this.generator = generator;
    }

    @GetMapping(value = "generate_tx_id")
    public JsonResult generateTxId() {
        return JsonResponse.getSuccessResult(generator.snowflakeId());
    }
}