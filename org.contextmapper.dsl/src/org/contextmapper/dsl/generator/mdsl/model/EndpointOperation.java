/*
 * Copyright 2019 The Context Mapper Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.contextmapper.dsl.generator.mdsl.model;

public class EndpointOperation {

	private String name;
	private DataType expectingPayload;
	private boolean expectingCollection = false;
	private boolean deliveringCollection = false;
	private DataType deliveringPayload;
	private String endpointResponsibility;
	private boolean endpointResponsibilityPatternMatched;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DataType getExpectingPayload() {
		return expectingPayload;
	}

	public void setExpectingPayload(DataType expectingPayload) {
		this.expectingPayload = expectingPayload;
	}

	public DataType getDeliveringPayload() {
		return deliveringPayload;
	}

	public void setDeliveringPayload(DataType deliveringPayload) {
		this.deliveringPayload = deliveringPayload;
	}

	public boolean deliveringCollection() {
		return deliveringCollection;
	}

	public void setDeliveringCollection(boolean deliveringCollection) {
		this.deliveringCollection = deliveringCollection;
	}
	
	public boolean expectingCollection() {
		return expectingCollection;
	}
	
	public void setExpectingCollection(boolean expectingCollection) {
		this.expectingCollection = expectingCollection;
	}
	
	public void setEndpointResponsibility(String endpointResponsibility) {
		this.endpointResponsibility = endpointResponsibility;
	}
	
	public String getEndpointResponsibility() {
		return endpointResponsibility;
	}
	
	public void setEndpointResponsibilityPatternMatched(boolean endpointResponsibilityPatternMatched) {
		this.endpointResponsibilityPatternMatched = endpointResponsibilityPatternMatched;
	}
	
	public boolean isEndpointResponsibilityPatternMatched() {
		return endpointResponsibilityPatternMatched;
	}

}
