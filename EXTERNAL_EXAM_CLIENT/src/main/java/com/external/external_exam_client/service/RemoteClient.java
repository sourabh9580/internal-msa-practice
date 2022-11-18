/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.external.external_exam_client.service;

import Entity.Category;
import Entity.Garments;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 *
 * @author Vivek
 */
@RegisterRestClient(baseUri = "http://localhost:8085/EXTERNAL_EXAM/rest/example/")
public interface RemoteClient {
    
    @ClientHeaderParam(name="authorization", value="Bearer eyJraWQiOiJqd3Qua2V5IiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJkdWtlIiwidXBuIjoiZHVrZSIsImF1dGhfdGltZSI6MTY2ODc1Mzc4MywiaXNzIjoiYWlyaGFja3MiLCJncm91cHMiOlsiQ1VTVE9NRVIiXSwiZXhwIjoxNjY4ODUzNzgzLCJpYXQiOjE2Njg3NTM3ODMsImp0aSI6IjQyIn0.Lzfs6TscEfK_HbW6NMO_q-zV8JZYCFMDsTkmz-xL53azv9WkHmOgCAZXH15Zy6msAVxmSvH3vbiHJqZYNT5thaeeOK7oyTVYyNQzMjdBS46MJJabmwQBTg7j3J7pfkBlH1Koe4N1abB2LlPlREf-hhV_bPW1ejMQXdZ0C5Jriw5uYXhiOQWa6pwxsNn-oimcjVKa0ACAvLFzFV47WJr7bE3-8268mcqLo3ZmQVOFaiqwW0iBr2O6vhLNVO-uBA2T9S2SW_eXfWHy1qeI68Uf9GqrwSeFwBdelOX9emc26nQa7z2_t6Lwct_y5eK6kvrvmYcauZcAIqqrE4UX2WtulQ")
    @GET
    @Path("getallgarments")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Garments> getallgarments();
    
    @ClientHeaderParam(name="authorization", value="Bearer eyJraWQiOiJqd3Qua2V5IiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJkdWtlIiwidXBuIjoiZHVrZSIsImF1dGhfdGltZSI6MTY2ODc1Mzc4MywiaXNzIjoiYWlyaGFja3MiLCJncm91cHMiOlsiQ1VTVE9NRVIiXSwiZXhwIjoxNjY4ODUzNzgzLCJpYXQiOjE2Njg3NTM3ODMsImp0aSI6IjQyIn0.Lzfs6TscEfK_HbW6NMO_q-zV8JZYCFMDsTkmz-xL53azv9WkHmOgCAZXH15Zy6msAVxmSvH3vbiHJqZYNT5thaeeOK7oyTVYyNQzMjdBS46MJJabmwQBTg7j3J7pfkBlH1Koe4N1abB2LlPlREf-hhV_bPW1ejMQXdZ0C5Jriw5uYXhiOQWa6pwxsNn-oimcjVKa0ACAvLFzFV47WJr7bE3-8268mcqLo3ZmQVOFaiqwW0iBr2O6vhLNVO-uBA2T9S2SW_eXfWHy1qeI68Uf9GqrwSeFwBdelOX9emc26nQa7z2_t6Lwct_y5eK6kvrvmYcauZcAIqqrE4UX2WtulQ")
    @GET
    @Path("getbycategory?category={id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Garments> getgarmentsbycategory(@PathParam("id")Integer categoryid);
    
    @ClientHeaderParam(name="authorization", value="Bearer eyJraWQiOiJqd3Qua2V5IiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJkdWtlIiwidXBuIjoiZHVrZSIsImF1dGhfdGltZSI6MTY2ODc1Mzc4MywiaXNzIjoiYWlyaGFja3MiLCJncm91cHMiOlsiQ1VTVE9NRVIiXSwiZXhwIjoxNjY4ODUzNzgzLCJpYXQiOjE2Njg3NTM3ODMsImp0aSI6IjQyIn0.Lzfs6TscEfK_HbW6NMO_q-zV8JZYCFMDsTkmz-xL53azv9WkHmOgCAZXH15Zy6msAVxmSvH3vbiHJqZYNT5thaeeOK7oyTVYyNQzMjdBS46MJJabmwQBTg7j3J7pfkBlH1Koe4N1abB2LlPlREf-hhV_bPW1ejMQXdZ0C5Jriw5uYXhiOQWa6pwxsNn-oimcjVKa0ACAvLFzFV47WJr7bE3-8268mcqLo3ZmQVOFaiqwW0iBr2O6vhLNVO-uBA2T9S2SW_eXfWHy1qeI68Uf9GqrwSeFwBdelOX9emc26nQa7z2_t6Lwct_y5eK6kvrvmYcauZcAIqqrE4UX2WtulQ")
    @GET
    @Path("getallcategories")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Category> getallcategories();
}
