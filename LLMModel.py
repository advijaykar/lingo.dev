class LLMModel:
    def __init__(self, model_name='gpt2'):
        from transformers import pipeline
        self.generator = pipeline('text-generation', model=model_name)

    def generate_text(self, prompt, max_length=50):
        result = self.generator(prompt, max_length=max_length, num_return_sequences=1)
        return result[0]['generated_text']

# Usage
llm = LLMModel()
output = llm.generate_text("The future of AI in India is")
print(output)
