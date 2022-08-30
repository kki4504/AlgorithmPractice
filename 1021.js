// N개의 원소를 포함하고 있는 양방향 순환 큐
// 1. 첫 번째 원소를 뽑아낸다. 1 2 ... N -> 2 ... N
// 2. 왼쪽으로 한 칸 동시킨다. 1 2 ... N -> 2 ... N 1
// 3. 오른쪽으로 한 칸 이동시킨다. 1 2 ... N -> N 1 2 ... N-1

// N이 주어진다, 뽑아내려 하는 원소 위치가 주어진다. ( 이 위치는 가장 처음 큐에서 위치 ).
// 이때 그 원소를 주어진 순서대로 뽑아내는데 드는 2, 3번 연산의 최솟값을 출력하는 프로그램

// 큐 크기 N, 뽑아내려 하는 수의 개수 M

class Dequeue extends Array {
  get_front () {
    return this[0]
  }

  get_back () {
    return this[this.length - 1]
  }

  front_pop () {
    return this.shift()
  }

  rotate (idx) {
    if(idx > 0) {
      while(idx--) {
        this.unshift(this.pop())
      }}
    else {
      while(idx++) {
        this.push(this.shift())
      }}
  }
}

const input = require('fs').readFileSync('./dev/stdin').toString().trim().split('\n');

const [queLength, searchNumLength] = input.shift().split(' ');
const searchNum = input.shift().split(' ').map(x => +x)

const solution = () => {
  const dequeue = new Dequeue();
  let count = 0;
  for (let i = 1; i <= queLength; i++) {
    dequeue.push(i);
  }
  searchNum.forEach (v => {
    let idx = dequeue.indexOf(v);
    if(v === dequeue[0]) {
      dequeue.front_pop()
    } else {
      if(idx <= Math.floor(dequeue.length / 2)) {
        dequeue.rotate(-idx);
        count += idx  
        dequeue.front_pop();
      } else {
        dequeue.rotate(dequeue.length - idx);
        count += dequeue.length - idx
        dequeue.front_pop();
      }
    }
  })

  return count
}

console.log(solution())