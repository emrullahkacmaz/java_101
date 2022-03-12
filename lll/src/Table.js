import React,{useState} from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';
import data from './Users.json'
import Button from '@material-ui/core/Button';
import AlertDialog from './Dialog';


const useStyles = makeStyles({
  table: {
    minWidth: 650,
  },
});

  function createData(id, name, email, website, phone) {
  return { id, name, email, website, phone };
}

const rows =data.map(data => {
    return {
      
      "id": data.id,
      "name":data.name,
      "email":data.email,
      "website":data.website,
      "phone":data.phone

    }
    
  })

  


export default function DataTable() {

const [data, setData]=useState([])
const [open, setOpen]=useState(false)
const [selectedData, setSelectData]=useState({})


   
    
  return (
    <TableContainer component={Paper}>
      <Table  aria-label="simple table">
        <TableHead>
                      { "KULLANICILAR"}
          <TableRow>
            <TableCell>id</TableCell>
            <TableCell align="right">name</TableCell>
            <TableCell align="right">email</TableCell>
            <TableCell align="right">website</TableCell>
            <TableCell align="right">phone</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {rows.map((row) => (
            <TableRow key={row.id}>
              <TableCell component="th" scope="row" >
              <Button variant="contained" onClick={()=>{
                  setOpen(true)
                  setSelectData({username:row.name,email:row.email,website:row.website,phone:row.phone })
              }}>{row.id}</Button>
              </TableCell>
              <TableCell align="right">{row.name}</TableCell>
              <TableCell align="right">{row.email}</TableCell>
              <TableCell align="right">{row.website}</TableCell>
              <TableCell align="right">{row.phone}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
      <AlertDialog
    selectedData={selectedData}
    />
    </TableContainer>
    
  );
  
}
