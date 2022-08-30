const input = require('fs').readFileSync('./dev/stdin').toString().trim().split(' ');

const [ x, y ] = input.map(x => +x);

const solution = (x, y) => {
    const result = x + y;
    return result;
}

console.log(solution(x, y))