package asd.asd.asd.editor;

import asd.asd.asd.Entity.Category;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class CategoryEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Category category = new Category(text,"base");
        setValue(category);
    }
}
