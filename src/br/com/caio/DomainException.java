package br.com.caio;

import java.io.Serial;

public class DomainException extends RuntimeException {
        @Serial
        private static final long serialVersionUID = 1L;
        public DomainException(String mensagem){
            super(mensagem);
        }
}
