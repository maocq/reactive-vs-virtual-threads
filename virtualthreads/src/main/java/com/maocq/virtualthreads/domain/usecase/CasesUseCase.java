package com.maocq.virtualthreads.domain.usecase;

import com.maocq.virtualthreads.domain.model.hello.gateway.HelloGateway;
import com.maocq.virtualthreads.domain.model.primes.Primes;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CasesUseCase {

    private final HelloGateway helloGateway;

    public String caseOne(int latency) {
        String x = helloGateway.hello(latency);
        return Primes.primes(10000);
    }
}
