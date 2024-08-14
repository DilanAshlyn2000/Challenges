//Create a list of students with their names and scores.
//Calculate the average score for each student.
//Determine the highest scorer.
//Filter students who scored above the average.
//Print the results.

let students = [
    { name: 'Vimal', scores: [55, 92, 88] },
    { name: 'Kayal', scores: [78, 85, 89] },
    { name: 'Abi', scores: [62, 90, 94] },
    { name: 'Vidhya', scores: [77, 72, 70] }
];

function calculateAverage(scores) {
    let total = scores.reduce((sum, score) => sum + score, 0);
    return total / scores.length;
}

students.forEach(student => {
    student.average = calculateAverage(student.scores);
});

let highestScorer = students.reduce((topStudent, student) => 
    (topStudent.average > student.average ? topStudent : student)
);

let overallAverage = students.reduce((sum, student) => sum + student.average, 0) / students.length;

let aboveAverageStudents = students.filter(student => student.average > overallAverage);

console.log('All Students with Averages:', students);
console.log('Highest Scorer:', highestScorer);
console.log('Students Scoring Above Average:', aboveAverageStudents);
