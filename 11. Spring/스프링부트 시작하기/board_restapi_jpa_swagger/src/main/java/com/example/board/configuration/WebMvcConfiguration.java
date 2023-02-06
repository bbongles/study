package com.example.board.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.board.interceptor.LoggerInterceptor;

import javax.servlet.Filter;
import java.nio.charset.Charset;


@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer{
	
	@Override
	public void addInterceptors(InterceptorRegistry registry){

		registry.addInterceptor(new LoggerInterceptor());

	} // end addInterceptors()

	/* 한글 처리를 위한 인코딩 설정은 스프링부트 2.1.x 버전보다 아래 버전을 사용시 적용
	@Bean
	public Filter characterEncodingFilter() {

		CharacterEncodingFilter characterEncodingFilter =  new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);

		return characterEncodingFilter;

	} // end characterEncodingFilter()

	@Bean
	public HttpMessageConverter<String> responseBodyConverter() {

		return new StringHttpMessageConverter(Charset.forName("UTF-8"));

	} // end responseBodyConverter()
	*/

	// 파일 처리를 위한 빈 설정
	@Bean
	public CommonsMultipartResolver multipartResolver() {

		CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();

		commonsMultipartResolver.setDefaultEncoding("UTF-8");
		commonsMultipartResolver.setMaxUploadSizePerFile(5 * 1024 * 1024);

		return commonsMultipartResolver;

	} // end multipartResolver()

} // end class WebMvcConfiguration
