

# The Spring context: Defining beans

## Table of Contents

- [What is Spring context?](#what-is-spring-context)
- [Adding new beans to the Spring context](#adding-new-beans-to-the-spring-context)

---
Learning how to work with a crucial Spring framework element: the context.

---
### What is Spring `Context`?

A `place` in the memory of your app in which we add all the object instances that we want the framework to manage.

By default, Spring doesn’t know any of the objects you define in your application. To enable Spring to see your objects, you need to add them to the `context`.


Spring uses the instances in the context to connect your app to various functionalities it provides.


 We named all these object instances  as `beans`.

[Back to Top](#table-of-contents)

---

 ### Adding new beans to the Spring context

You’ll learn how to add new object instances (i.e., beans) to the Spring context.

You can add beans in the context in the following ways:
- Using the @Bean annotation 
- Using stereotype annotations
- Programmatically