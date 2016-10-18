/*
 * Copyright (c) 2013-2016, Neuro4j
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.neuro4j.workflow.node;

import org.neuro4j.workflow.ActionBlock;
import org.neuro4j.workflow.FlowContext;
import org.neuro4j.workflow.common.FlowExecutionException;

/**
 * 
 * CustomBlock provides base implementation for user's blocks.
 * Users should extend this class during developing own blocks.
 * 
 */
public abstract class CustomBlock implements ActionBlock {

	/**
     * Default constructor.
     */
    public CustomBlock() {
        super();
    }
    
    @Override
	public int execute(FlowContext context) throws FlowExecutionException {
		return 0;
	}

	@Override
	public void init() throws FlowExecutionException {
		
	}

	@Override
	public boolean cacheable() {
		return true;
	}


}
