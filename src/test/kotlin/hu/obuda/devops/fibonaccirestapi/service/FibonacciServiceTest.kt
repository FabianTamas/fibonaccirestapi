package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()

    @Test
    fun shouldReturn0WhenCall1() {
        val result = underTest.fibonacci(1)
        assertEquals(0, result)
    }

    @Test
    fun shouldReturn1WhenCall2() {
        val result = underTest.fibonacci(2)
        assertEquals(1, result)
    }

    @Test
    fun shouldReturn1WhenCall3() {
        val result = underTest.fibonacci(3)
        assertEquals(1, result)
    }

    @Test
    fun shouldReturn2WhenCall4() {
        val result = underTest.fibonacci(4)
        assertEquals(2, result)
    }

    @Test
    fun shouldReturn3WhenCall5() {
        val result = underTest.fibonacci(5)
        assertEquals(3, result)
    }

    @Test
    fun shouldReturn5WhenCall6() {
        val result = underTest.fibonacci(6)
        assertEquals(5, result)
    }

    @Test
    fun shouldReturn13WhenCall8() {
        val result = underTest.fibonacci(8)
        assertEquals(13, result)
    }

    @Test
    fun shouldReturn34WhenCall10() {
        val result = underTest.fibonacci(10)
        assertEquals(34, result)
    }

    @Test
    fun shouldThrowExceptionWhenCallWithZero() {
        assertThrows<IllegalArgumentException> {
            underTest.fibonacci(0)
        }
    }

    @Test
    fun shouldThrowExceptionWhenCallWithNegativeNumber() {
        assertThrows<IllegalArgumentException> {
            underTest.fibonacci(-5)
        }
    }
}
