const [length, input] = require('fs').readFileSync('./dev/stdin').toString().trim().split('\n');

const arr = input.split(' ').map(x => +x);
const solution = () => {
  let Y = 0;
  let M = 0;
  let result = '';
  for(let i = 0; i < arr.length; i++) {
    Y += parseInt(arr[i] / 30)
    M += parseInt(arr[i] / 60)
    // Y
    if(arr[i] % 30)
      Y += 1
    if(arr[i] >= 30 && !(arr[i] % 30))
      Y += 1
    // M
    if(arr[i] % 60)
      M += 1
    if(arr[i] >= 60 && !(arr[i] % 60))
      M += 1
  }
  Y = Y * 10;
  M = M * 15;
  if(Y === M) {result = `Y M ${Y}`}
  else if(Y < M) {result = `Y ${Y}`}
  else {
    result = `M ${M}`
  }
  return result;
}

console.log(solution())