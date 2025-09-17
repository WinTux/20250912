package com.example.microservicio_kafka_almacen.kafka;

import com.example.microservicio_kafka_base.DTO.OrdenEvento;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumidorOrden {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumidorOrden.class);
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumir(OrdenEvento ordenEvento){
        LOGGER.info(String.format("OrdenEvento recibido en el microservico almacen: %s", ordenEvento.toString()));
        // Registrar una orden en la DDBB
    }
}