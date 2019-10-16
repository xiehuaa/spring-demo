package org.spring.self.schema;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    protected Class getBeanClass(Element element) {
        return User.class;
    }

    protected void doParse(Element element, BeanDefinitionBuilder beanDefinitionBuilder) {
        String userName = element.getAttribute("userName");
        String email = element.getAttribute("email");

        if (userName != null && userName != "") {
            beanDefinitionBuilder.addPropertyValue("userName", userName);
        }
        if (email != null && email != "") {
            beanDefinitionBuilder.addPropertyValue("email", email);
        }
    }
}
