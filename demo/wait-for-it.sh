#!/bin/bash
# wait-for-it.sh

set -e

host="$1"
port="$2"
shift 2
cmd="$@"

# Check if host and port are provided
if [ "$#" -eq 0 ]; then
    echo "Usage: $0 host:port [-- command args]"
    exit 1
fi

# Function to check if the service is up
function check_service() {
    nc -z "$host" "$port" > /dev/null 2>&1
}

# Try to connect to the service
until check_service; do
  >&2 echo "Waiting for $host:$port - service is not available yet"
  sleep 1
done

>&2 echo "$host:$port is up - executing command"
exec $cmd
