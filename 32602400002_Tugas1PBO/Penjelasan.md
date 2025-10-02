## PENJELASAN KESALAHAN DAN PERBAIKANNYA
| No | Class       | Kesalahan                                                                 | Perbaikan                                                     |
|----|-------------|---------------------------------------------------------------------------|---------------------------------------------------------------|
| 1  | MakhlukHidup | `private string nama;` salah karena seharusnya `String` bukan `string`. | `private String nama;` |
| 2  | MakhlukHidup | `public void MakhlukHidup(String nama)` karena ada `void` membuatnya jadi method biasa, padahal menurut saya ini dimaksudkan untuk jadi Constructor. | Hapus `void` agar jadi Constructor: `public MakhlukHidup(String nama)` |
| 3  | MakhlukHidup | Constructor `public makhlukHidup(...)` salah penulisan huruf besar kecil, nama Constructor harus sama dengan Class. | Harus konsisten: `public MakhlukHidup(String nama, String jenis, int umur, double berat)` |
| 4  | MakhlukHidup | Pada constructor `public MakhlukHidup(String nama, String jenis, int umur, double berat)`,<br>`this.nama = jenis; this.jenis = nama;` tertukar | Perbaikan:<br> `this.nama = nama;`<br>`this.jenis = jenis;` |
| 5  | MakhlukHidup | Pada constructor `public MakhlukHidup(MakhlukHidup other)`, `this.nama = nama;` mengambil variabel lokal yang tidak ada, harus dari `other`. | `this.nama = other.nama;` |
| 6  | MakhlukHidup | Constructor `public MakhlukHidup(MakhlukHidup other)`, `this.umur = this.umur;` tidak menyalin dari `other`. | `this.umur = other.umur;` |
| 7  | MakhlukHidup | Setter `public void setUmur(String umur)` salah tipe parameter, `umur` adalah `int`. | `public void setUmur(int umur)` |
| 8  | MakhlukHidup | Setter `setUmur` dapat menerima umur negatif tanpa validasi. | Tambahkan validasi: `if (umur > 0) this.umur = umur;` |
| 9  | MakhlukHidup | Setter `setNama`, `nama = this.nama;` kebalik, jadinya tidak mengubah atribut. | Harusnya `this.nama = nama;` |
| 10 | MakhlukHidup | `public int getInfo()` return type salah, karena nilai kembaliannya adalah String. | `public String getInfo()` |
| 11 | TestAccess  | `m.nama = "Kucing";` error, karena `nama` itu private. | Gunakan setter untuk mengubah nama: `m.setNama("Kucing");` |
| 12 | TestAccess  | `m2.MakhlukHidup("Kuda");`, constructor tidak bisa dipanggil seperti method. | Jika ingin ubah nama, gunakan setter: `m2.setNama("Kuda");` |
| 13 | TestAccess  | `m3.setUmur(-10);` sebelumnya salah karena method `setUmur` terdefinisi dengan `String`. | Setelah perbaikan, tidak perlu ada perubahan pada baris ini.<br>Walaupun inputnya -10, nanti akan ada validasi agar umur tidak menerima nilai negatif. |

## Hasil Output Setelah Perbaikan
> Nama=Kucing, Jenis=Unknown, Umur=15, Berat=10.0<br>
> Nama=Harimau, Jenis=Hewan, Umur=3, Berat=120.0<br>
> Nama=Kuda, Jenis=Hewan, Umur=3, Berat=120.0<br>
> Nama=Harimau, Jenis=Hewan, Umur=3, Berat=120.0<br>
