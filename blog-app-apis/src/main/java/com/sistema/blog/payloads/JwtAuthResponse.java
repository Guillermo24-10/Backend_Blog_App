package com.sistema.blog.payloads;

import lombok.Data;

@Data
public class JwtAuthResponse {

	private String token;
	private String username;
}