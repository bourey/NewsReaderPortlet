/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.portlet.newsreader.model;

import com.sun.syndication.feed.synd.SyndEntryImpl;

/**
 * 
 * @author Jen Bourey, jennifer.bourey@gmail.com
 * @version $Revision$
 */
public class NewsFeedItem extends SyndEntryImpl {

    private static final long serialVersionUID = 9169435530958004414L;
    
    private String imageUrl;
    
    public NewsFeedItem() {
        super();
    }
    
    public String getImageUrl() {
        return imageUrl;
    }
    
    public void setImageUrl(String url) {
        this.imageUrl = url;
    }
    
}