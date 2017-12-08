package com.github.chunyang130;

import org.junit.Assert;
import org.junit.Test;

public class hellTest {
    @Test
    public void getType() throws Exception {
        // Arrange
        hell triangle = new hell(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
