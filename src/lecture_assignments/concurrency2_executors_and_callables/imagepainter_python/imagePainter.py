import concurrent.futures

def paint_quadrant(matrix, start_row, end_row, start_col, end_col, color):
    for row in range(start_row, end_row):
        for col in range(start_col, end_col):
            matrix[row][col] = color

def divide_and_paint(matrix, colors):
    # get dimensions of the matrix
    rows = len(matrix)
    cols = len(matrix[0])

    # mid points for dividing the matrix
    mid_row = rows // 2
    mid_col = cols // 2

    # ThreadPoolExecutor for parallel execution
    with concurrent.futures.ThreadPoolExecutor() as executor:
        futures = [
            executor.submit(paint_quadrant, matrix, 0, mid_row, 0, mid_col, colors[0]),  # topleft
            executor.submit(paint_quadrant, matrix, 0, mid_row, mid_col, cols, colors[1]),   # topright
            executor.submit(paint_quadrant, matrix, mid_row, rows, 0, mid_col, colors[2]),   # bottomleft
            executor.submit(paint_quadrant, matrix, mid_row, rows, mid_col, cols, colors[3]),    # bottomright
        ]

    # wait for all threads to complete
    concurrent.futures.wait(futures)


# Example usage:
matrix = [[0, 0, 0, 0],
          [0, 0, 0, 0],
          [0, 0, 0, 0],
          [0, 0, 0, 0]]

# color is given
colors = ["red","blue","green","yellow"]

divide_and_paint(matrix, colors)

# Print the painted matrix
for row in matrix:
    print(row)