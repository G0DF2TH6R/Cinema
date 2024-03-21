
const Movie = ({name, length, genre}) => {
    return(
        <div>
            <h1> { name } </h1>
            <h1>Length: { length } </h1>
            <h1>Genre: { genre } </h1>
        </div>
    )
}

export default Movie