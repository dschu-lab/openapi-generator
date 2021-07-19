package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import java.math.BigDecimal;
import org.openapitools.client.model.Client;
import java.io.File;
import org.openapitools.client.model.FileSchemaTestClass;
import org.openapitools.client.model.HealthCheckResult;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.OuterObjectWithEnumProperty;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FakeApi {
  /**
   * Health check endpoint
   * 
   * @return Call&lt;HealthCheckResult&gt;
   */
  @GET("fake/health")
  Call<HealthCheckResult> fakeHealthGet();
    

  /**
   * test http signature authentication
   * 
   * @param pet Pet object that needs to be added to the store (required)
   * @param query1 query parameter (optional)
   * @param header1 header parameter (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("fake/http-signature-test")
  Call<Void> fakeHttpSignatureTest(
    @retrofit2.http.Body Pet pet, @retrofit2.http.Query("query_1") String query1, @retrofit2.http.Header("header_1") String header1
  );

  /**
   * 
   * Test serialization of outer boolean types
   * @param body Input boolean as post body (optional)
   * @return Call&lt;Boolean&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fake/outer/boolean")
  Call<Boolean> fakeOuterBooleanSerialize(
    @retrofit2.http.Body Boolean body
  );

  /**
   * 
   * Test serialization of object with outer number type
   * @param outerComposite Input composite as post body (optional)
   * @return Call&lt;OuterComposite&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fake/outer/composite")
  Call<OuterComposite> fakeOuterCompositeSerialize(
    @retrofit2.http.Body OuterComposite outerComposite
  );

  /**
   * 
   * Test serialization of outer number types
   * @param body Input number as post body (optional)
   * @return Call&lt;BigDecimal&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fake/outer/number")
  Call<BigDecimal> fakeOuterNumberSerialize(
    @retrofit2.http.Body BigDecimal body
  );

  /**
   * 
   * Test serialization of outer string types
   * @param body Input string as post body (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fake/outer/string")
  Call<String> fakeOuterStringSerialize(
    @retrofit2.http.Body String body
  );

  /**
   * 
   * Test serialization of enum (int) properties with examples
   * @param outerObjectWithEnumProperty Input enum (int) as post body (required)
   * @return Call&lt;OuterObjectWithEnumProperty&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fake/property/enum-int")
  Call<OuterObjectWithEnumProperty> fakePropertyEnumIntegerSerialize(
    @retrofit2.http.Body OuterObjectWithEnumProperty outerObjectWithEnumProperty
  );

  /**
   * 
   * For this test, the body has to be a binary file.
   * @param body image to upload (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:image/png"
  })
  @PUT("fake/body-with-binary")
  Call<Void> testBodyWithBinary(
    @retrofit2.http.Body File body
  );

  /**
   * 
   * For this test, the body for this request must reference a schema named &#x60;File&#x60;.
   * @param fileSchemaTestClass  (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("fake/body-with-file-schema")
  Call<Void> testBodyWithFileSchema(
    @retrofit2.http.Body FileSchemaTestClass fileSchemaTestClass
  );

  /**
   * 
   * 
   * @param query  (required)
   * @param user  (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("fake/body-with-query-params")
  Call<Void> testBodyWithQueryParams(
    @retrofit2.http.Query("query") String query, @retrofit2.http.Body User user
  );

  /**
   * To test \&quot;client\&quot; model
   * To test \&quot;client\&quot; model
   * @param client client model (required)
   * @return Call&lt;Client&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("fake")
  Call<Client> testClientModel(
    @retrofit2.http.Body Client client
  );

  /**
   * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
   * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
   * @param number None (required)
   * @param _double None (required)
   * @param patternWithoutDelimiter None (required)
   * @param _byte None (required)
   * @param integer None (optional)
   * @param int32 None (optional)
   * @param int64 None (optional)
   * @param _float None (optional)
   * @param string None (optional)
   * @param binary None (optional)
   * @param date None (optional)
   * @param dateTime None (optional)
   * @param password None (optional)
   * @param paramCallback None (optional)
   * @return Call&lt;Void&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("fake")
  Call<Void> testEndpointParameters(
    @retrofit2.http.Field("number") BigDecimal number, @retrofit2.http.Field("double") Double _double, @retrofit2.http.Field("pattern_without_delimiter") String patternWithoutDelimiter, @retrofit2.http.Field("byte") byte[] _byte, @retrofit2.http.Field("integer") Integer integer, @retrofit2.http.Field("int32") Integer int32, @retrofit2.http.Field("int64") Long int64, @retrofit2.http.Field("float") Float _float, @retrofit2.http.Field("string") String string, @retrofit2.http.Field("binary") MultipartBody.Part binary, @retrofit2.http.Field("date") LocalDate date, @retrofit2.http.Field("dateTime") OffsetDateTime dateTime, @retrofit2.http.Field("password") String password, @retrofit2.http.Field("callback") String paramCallback
  );

  /**
   * To test enum parameters
   * To test enum parameters
   * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
   * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
   * @param enumQueryStringArray Query parameter enum test (string array) (optional)
   * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
   * @param enumQueryInteger Query parameter enum test (double) (optional)
   * @param enumQueryDouble Query parameter enum test (double) (optional)
   * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
   * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
   * @return Call&lt;Void&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @GET("fake")
  Call<Void> testEnumParameters(
    @retrofit2.http.Header("enum_header_string_array") List<String> enumHeaderStringArray, @retrofit2.http.Header("enum_header_string") String enumHeaderString, @retrofit2.http.Query("enum_query_string_array") List<String> enumQueryStringArray, @retrofit2.http.Query("enum_query_string") String enumQueryString, @retrofit2.http.Query("enum_query_integer") Integer enumQueryInteger, @retrofit2.http.Query("enum_query_double") Double enumQueryDouble, @retrofit2.http.Field("enum_form_string_array") List<String> enumFormStringArray, @retrofit2.http.Field("enum_form_string") String enumFormString
  );

  /**
   * Fake endpoint to test group parameters (optional)
   * Fake endpoint to test group parameters (optional)
   * @param requiredStringGroup Required String in group parameters (required)
   * @param requiredBooleanGroup Required Boolean in group parameters (required)
   * @param requiredInt64Group Required Integer in group parameters (required)
   * @param stringGroup String in group parameters (optional)
   * @param booleanGroup Boolean in group parameters (optional)
   * @param int64Group Integer in group parameters (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("fake")
  Call<Void> testGroupParameters(
    @retrofit2.http.Query("required_string_group") Integer requiredStringGroup, @retrofit2.http.Header("required_boolean_group") Boolean requiredBooleanGroup, @retrofit2.http.Query("required_int64_group") Long requiredInt64Group, @retrofit2.http.Query("string_group") Integer stringGroup, @retrofit2.http.Header("boolean_group") Boolean booleanGroup, @retrofit2.http.Query("int64_group") Long int64Group
  );

  /**
   * test inline additionalProperties
   * 
   * @param requestBody request body (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fake/inline-additionalProperties")
  Call<Void> testInlineAdditionalProperties(
    @retrofit2.http.Body Map<String, String> requestBody
  );

  /**
   * test json serialization of form data
   * 
   * @param param field1 (required)
   * @param param2 field2 (required)
   * @return Call&lt;Void&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @GET("fake/jsonFormData")
  Call<Void> testJsonFormData(
    @retrofit2.http.Field("param") String param, @retrofit2.http.Field("param2") String param2
  );

  /**
   * 
   * To test the collection format in query parameters
   * @param pipe  (required)
   * @param ioutil  (required)
   * @param http  (required)
   * @param url  (required)
   * @param context  (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("fake/test-query-paramters")
  Call<Void> testQueryParameterCollectionFormat(
    @retrofit2.http.Query("pipe") PIPESParams pipe, @retrofit2.http.Query("ioutil") CSVParams ioutil, @retrofit2.http.Query("http") SSVParams http, @retrofit2.http.Query("url") CSVParams url, @retrofit2.http.Query("context") List<String> context
  );

}