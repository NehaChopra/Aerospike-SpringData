package com.quintifi.aeroSpringData.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.aerospike.core.AerospikeTemplate;
import org.springframework.data.aerospike.repository.config.EnableAerospikeRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.AerospikeException;
import com.aerospike.client.policy.ClientPolicy;

@Configuration
@EnableAerospikeRepositories(basePackages = {"com.quintifi.aeroSpringData.repository"})
@EnableAutoConfiguration
@EnableTransactionManagement
public class RepositoryConfiguration{
	
	@Bean(destroyMethod="close")
	public AerospikeClient aerospikeClient() throws AerospikeException {
		ClientPolicy policy = new ClientPolicy();
		policy.failIfNotConnected = true;
		return new AerospikeClient(policy, "localhost", 3000);
	}
	
	@Bean()
	public AerospikeTemplate aerospikeTemplate() throws AerospikeException {
		return new AerospikeTemplate(aerospikeClient(), "default");
	}
}