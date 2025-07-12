const http = require('http');
const port = 3000;

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('Hello from Dockerized Node.js app! - Test OK\n'); // Możesz zmienić tekst na coś charakterystycznego
});

server.listen(port, () => {
  console.log(`Server running at http://localhost:${port}/`);
});
