const [ NM, ...input ] = require('fs').readFileSync('./dev/stdin').toString().trim().split('\n');

const arrN = new Set(input[0].split(' ').map(x => +x));
const arrM = new Set(input[1].split(' ').map(x => +x));

const set = new Set([...arrN, ...arrM]);

const solution = () => {
  let count = 0
  for (v of arrN) {
    if (arrM.has(v)){
      count ++
    }
  }
  return set.size - count
}

console.log(solution())