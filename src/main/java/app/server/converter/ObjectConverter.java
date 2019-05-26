package app.server.converter;

import app.server.bean.RatingDetails;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @Author：Liu hanyi
 * @Description：
 * @Date Created in ${Time} ${Date}
 * @Modified By:
 */
@Converter(autoApply = true)
public class ObjectConverter implements AttributeConverter<RatingDetails,String> {
    @Override
    public String convertToDatabaseColumn(RatingDetails attribute) {
        String json = JSON.toJSONString(attribute);
        return json;
    }

    @Override
    public RatingDetails convertToEntityAttribute(String dbData) {
        RatingDetails o = JSONObject.parseObject(dbData,RatingDetails.class);
        return o;
    }
}
