 following guidelines should be followed while coding and validated during PR code reviews.

- Follow OWASP guidelines. Authentication, authorization, input data validation against security threats such as SQL injections and Cross Site Scripting (XSS), encrypting the sensitive data (passwords, credit card information etc). Validate inputs (for valid data, size, range, boundary conditions, etc).
- Avoid dynamic SQL, use prepared statement
- Follow SOLID principles for designing all classes and methods. Keep classes and methods small and write reusable code. Try to break down all functions into smaller more generic functions. If you find yourself writing too many if-else conditions, stop and consider whether you need to design an abstraction instead. Code to interface, not implementation. Use marker interfaces to define types.

- Ideally a single class should fit in the standard 14 inch laptop screen. There shouldn’t be a need to scroll horizontally to view the code. In a 21 inch monitor, other windows (toolbox, properties etc.) can be opened while modifying code, so always write code keeping in view a 14 inch monitor.

- Write code as testable as possible. Try to avoid static functions, singleton classes as these are not easily testable by mocks/fixtures. Follow TDD as much as possible so code is automatically testable.

Meaningful names - Use Intention-Revealing Names, Pick one word per concept, Use Solution/Problem Domain Names.

- Use consistent style - Please make sure to use project configured style and formatting throughout the code.

- Logging - Use logging as much as possible wherever appropriate. Make sure not to expose critical information in logging(if not encrypted). Use appropriate log levels. Avoid excessive logs for unusual behavior (e.g. DoS attack). Provide support to log the flow of control, parameter data and exception details to find the root cause easily.

- Code quality and Code coverage via tests - Maintain the quality of code with zero bugs and vulnerabilities. Code coverage reports must be generated for each build. Code coverage via tests of 60% may be desirable, but it is much more important to have good sensible tests which focus on the 20% code which affects 80% of the functionality (Pareto principle). Keep the testing pyramid in mind while writing tests.

- Dev credentials should always be externalized, for local use add in ~/.gradle/gradle.properties, rather than $PROJECT/gradle.properties

- Exception handling - In Java, don't use nulls or return codes for exceptional conditions, use standard Java exception handling mechanism. Purge sensitive information from exceptions (exposing file path, internals of the system, configuration). Release resources (Streams, Connections, etc) in all cases. Use custom runtime exceptions for most use cases and try to avoid propagating checked exceptions. Don't ignore possible/actual exceptions.

- Functional code - Try to use Java 8 style functional paradigms as much as possible. Functional style error handling can take precedence over exception handling style if it leads to cleaner, more observable code.

- Return empty arrays or collections, not nulls

- Comments - Your code should be self-explanatory and readable as much as possible. Don't pepper it with meaningless comments which then go out of sync when the code changes.

- Javadoc - All public apis which can be consumed should have standard javadoc. Don't leave in meaningless auto-generated javadoc. Don't put javadoc on non-public non-consumable apis.

- Make class final if not being used for inheritance

- Restrict privileges: Application to run with the least privilege mode required for functioning. Minimize the accessibility of packages, classes, interfaces, methods, and fields.

- Make public static fields final (to avoid caller changing the value)

- Try to minimize uses of magic strings, magic numbers, etc.

- Be careful caching results of potentially privileged operations

- Avoid excessive synchronization. Keep Synchronized Sections Small. Prefer executors to tasks and threads.

- Beware the performance of string concatenation

- Use enums instead of int constants

- Always override toString. Always override hashCode when you override equals when putting objects in a hashtable. Always implement comparator/comparable when putting objects in a sorted collection.
