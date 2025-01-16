# Prompt Engineering Tips

## General Tips

### 1. Be Clear and Specific
- Clearly state what you want the model to do.
- Avoid ambiguous language.
- Provide specific examples if possible.

### 2. Use Step-by-Step Instructions
- Break down complex tasks into smaller steps.
- Guide the model through each step.

### 3. Provide Context
- Give the model enough context to understand the task.
- Include relevant background information.

### 4. Experiment with Different Phrasings
- Try different ways of phrasing your prompt.
- See which version yields the best results.

### 5. Use Constraints
- Set boundaries for the model's responses.
- Specify any limitations or rules.

### 6. Iterate and Refine
- Continuously refine your prompts based on the model's output.
- Make adjustments to improve accuracy and relevance.

### 7. Leverage Examples
- Provide positive and negative examples.
- Show the model what to do and what to avoid.

### 8. Test with Edge Cases
- Test your prompts with edge cases to ensure robustness.
- Identify and address any weaknesses.

### 9. Use System Messages
- Use system-level instructions to guide the model's behavior.
- Set the tone and style of the responses.

### 10. Keep Prompts Concise
- Avoid overly long prompts.
- Keep them concise and to the point.

## Role-Specific Tips

### Software Engineer
- **Code Generation**: "Generate a function in Python that calculates the factorial of a number."
- **Code Review**: "Review this JavaScript code for potential bugs and suggest improvements."
- **Documentation**: "Create documentation for this API endpoint in Markdown format."

### DevOps Engineer
- **Infrastructure as Code**: "Write a Terraform script to create an AWS S3 bucket with versioning enabled."
- **CI/CD Pipelines**: "Generate a GitHub Actions workflow for a Node.js project with linting and testing steps."
- **Monitoring and Alerts**: "Create a Prometheus alert rule for high CPU usage on a Kubernetes cluster."

### QA Tester
- **Test Case Generation**: "Generate test cases for a login feature with email and password validation."
- **Automated Testing**: "Write a Selenium script in Python to automate the login process on a web application."
- **Bug Reporting**: "Draft a bug report for a UI issue where the submit button is not clickable on the registration form."

## Information to Include in a Prompt for the Best Answer

To get the best answer, a prompt should contain the following information:

1. **Objective**: Clearly state what you want to achieve.
2. **Context**: Provide any relevant background information or context.
3. **Specific Requirements**: List any specific requirements or constraints.
4. **Examples**: Include examples if applicable to illustrate what you are looking for.
5. **Preferred Language/Framework**: Specify the programming language or framework to be used.
6. **Output Format**: Indicate the desired format of the output (e.g., code snippet, full project structure).
7. **Additional Details**: Any other details that might help in generating a more accurate response.

### Example Prompt

**Prompt:**
Create a basic iOS mobile app using Swift. The app should have a single screen with a label that says "Hello, World!" and a button that, when tapped, changes the label text to "Button Pressed". The app should be compatible with iOS 14 and later.

**Information Breakdown:**
1. **Objective**: Create a basic iOS mobile app.
2. **Context**: The app is for iOS devices.
3. **Specific Requirements**: Single screen, label with initial text "Hello, World!", button to change label text to "Button Pressed".
4. **Examples**: N/A
5. **Preferred Language/Framework**: Swift
6. **Output Format**: Code snippet
7. **Additional Details**: Compatible with iOS 14 and later.