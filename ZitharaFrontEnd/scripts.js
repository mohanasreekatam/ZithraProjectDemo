document.addEventListener("DOMContentLoaded", function() {
  
    const records = [
      { sno: 1, name: "John Doe", age: 30, phone: "1234567890", location: "New York", created_at: "2024-03-03T09:00:00" },
      
    ];
  
    const recordsTable = document.getElementById("recordsBody");
    const searchInput = document.getElementById("searchInput");
    const sortSelect = document.getElementById("sortSelect");
  
    function renderRecords(records) {
      recordsTable.innerHTML = "";
      records.forEach(record => {
        const { sno, name, age, phone, location, created_at } = record;
        const date = new Date(created_at);
        const formattedDate = date.toLocaleDateString();
        const formattedTime = date.toLocaleTimeString();
        const row = `<tr>
                      <td>${sno}</td>
                      <td>${name}</td>
                      <td>${age}</td>
                      <td>${phone}</td>
                      <td>${location}</td>
                      <td>${formattedDate}</td>
                      <td>${formattedTime}</td>
                    </tr>`;
        recordsTable.innerHTML += row;
      });
    }
  
    function filterRecords() {
      const searchText = searchInput.value.toLowerCase();
      const filteredRecords = records.filter(record =>
        record.name.toLowerCase().includes(searchText) ||
        record.location.toLowerCase().includes(searchText)
      );
      renderRecords(filteredRecords);
    }
  
    function sortRecords() {
      const sortBy = sortSelect.value;
      const sortedRecords = [...records].sort((a, b) => {
        if (sortBy === "date") {
          return new Date(a.created_at) - new Date(b.created_at);
        } else {
          return new Date(a.created_at).getTime() - new Date(b.created_at).getTime();
        }
      });
      renderRecords(sortedRecords);
    }
  
    searchInput.addEventListener("keyup", filterRecords);
    sortSelect.addEventListener("change", sortRecords);
  
    // Initial rendering
    renderRecords(records);
  });