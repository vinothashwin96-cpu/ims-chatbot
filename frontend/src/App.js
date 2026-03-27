

import React, { useState } from "react";

function App() {
  const [input, setInput] = useState("");
  const [answer, setAnswer] = useState("");

  const askQuestion = async () => {
    const response = await fetch("http://localhost:8080/chat", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ question: input }),
    });

    const data = await response.json();
    setAnswer(data.answer);
  };

  return (
    <div>
      <h1>IMS Chatbot</h1>

      <input
        type="text"
        value={input}
        onChange={(e) => setInput(e.target.value)}
      />

      <button onClick={askQuestion}>Ask</button>

      <p>{answer}</p>
    </div>
  );
}

export default App;