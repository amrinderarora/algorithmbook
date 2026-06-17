INF = float("inf")

def floyd_warshall(vertices, edges):
    # Initialize distances
    dist = {u: {v: INF for v in vertices} for u in vertices}

    for v in vertices:
        dist[v][v] = 0

    for u, v, w in edges:
        dist[u][v] = w

    # Dynamic programming
    for k in vertices:
        for i in vertices:
            for j in vertices:
                dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])

    return dist


vertices = list("ABCDEFGHIJKLMNO")

edges = [
    ("A", "B", 4), ("A", "C", 2),
    ("B", "D", 5), ("B", "E", 10),
    ("C", "B", 1), ("C", "F", 7),
    ("D", "E", 2), ("D", "G", 6),
    ("E", "H", 3), ("E", "C", 6),
    ("F", "D", 2), ("F", "I", 4),
    ("G", "J", 1),
    ("H", "G", 2), ("H", "K", 8),
    ("I", "H", 1), ("I", "L", 6),
    ("J", "K", 3), ("J", "O", 7),
    ("K", "N", 5), ("K", "F", 9),
    ("L", "M", 2),
    ("M", "N", 1),
    ("N", "O", 4),
    ("O", "L", 3),
]

dist = floyd_warshall(vertices, edges)

# Print distance matrix
print("   " + " ".join(f"{v:>4}" for v in vertices))
for i in vertices:
    row = []
    for j in vertices:
        value = dist[i][j]
        row.append("∞" if value == INF else str(value))
    print(f"{i:>2} " + " ".join(f"{x:>4}" for x in row))
