package com.xala3pa.book;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xala3pa.domains.Book;
import com.xala3pa.views.Views;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class BookTest {

    private Book thinking;

    @Before
    public void runBeforeTestMethod() {
       thinking =  new Book("0374275637", "Thinking, Fast and Slow",
                "Daniel Kahneman", 10, 234 );
    }

    @Test
    public void shouldSerializedPublicPropertiesWhenPublicView()
            throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        String result = mapper
                .writerWithView(Views.Public.class)
                .writeValueAsString(thinking);

        assertThat(result, containsString("0374275637"));
        assertThat(result, containsString("Thinking, Fast and Slow"));
        assertThat(result, containsString("Daniel Kahneman"));

        assertThat(result, not(containsString("10")));
        assertThat(result, not(containsString("234")));
    }

    @Test
    public void shouldSerializedInternalPropertiesWhenInternalView()
            throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        String result = mapper
                .writerWithView(Views.Internal.class)
                .writeValueAsString(thinking);

        assertThat(result, containsString("0374275637"));
        assertThat(result, containsString("Thinking, Fast and Slow"));
        assertThat(result, containsString("Daniel Kahneman"));
        assertThat(result, containsString("10"));
        assertThat(result, containsString("234"));
    }
}