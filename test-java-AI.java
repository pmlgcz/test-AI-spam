# Exemplo de novo e-mail a ser classificado
new_email = ["Oferta incrível para emagrecer rapidamente!"]

# Vetoriza o conteúdo do e-mail
new_email_vectorized = vectorizer.transform(new_email)

# Faz a previsão do rótulo do novo e-mail
prediction = model.predict(new_email_vectorized)

print("O e-mail foi classificado como:", prediction)
